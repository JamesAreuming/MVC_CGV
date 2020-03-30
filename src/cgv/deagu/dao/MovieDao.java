package cgv.deagu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cgv.deagu.jdbc.JDBCUtil;
import cgv.deagu.model.Movie;

public class MovieDao {
	private static MovieDao dao = new MovieDao();
	
	public static MovieDao getInstance() {
		return dao;
	}
	
	private MovieDao() {}
	
	public void insertMovie(Connection conn, Movie movie) throws SQLException {
		PreparedStatement pstmt = null;
		
		try {
			String sql = "insert into movie values(null,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, movie.getName());
			pstmt.setString(2, movie.getContent());
			pstmt.setString(3, movie.getFile());
			pstmt.setString(4, movie.getShowTime());
			pstmt.executeUpdate();
		}finally {
			JDBCUtil.close(pstmt);
		}
	}
	
	public List<Movie> listMovie(Connection conn) throws SQLException{
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select * from movie";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			ArrayList<Movie> list = new ArrayList<>();
			while(rs.next()) {
				Movie movie = new Movie(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
				
				list.add(movie);
			}
			return list;
		}finally {
			JDBCUtil.close(rs);
			JDBCUtil.close(pstmt);
		}
	}
	
	public Movie selectByNo(Connection conn, int no) throws SQLException {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			String sql = "select * from movie where movie_no = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				Movie movie = new Movie(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
				
				return movie;
			}
		}finally {
			JDBCUtil.close(rs);
			JDBCUtil.close(pstmt);
		}
		return null;
	}
	
	public void updateMovie(Connection conn, Movie movie) throws SQLException {
		PreparedStatement pstmt = null;
		try {
			String sql = "update movie set movie_name = ?, movie_content = ?, movie_file = ?, movie_time = ? where movie_no=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, movie.getName());
			pstmt.setString(2, movie.getContent());
			pstmt.setString(3, movie.getFile());
			pstmt.setString(4, movie.getShowTime());
			pstmt.setInt(5, movie.getNo());
			pstmt.executeUpdate();
		}finally {
			JDBCUtil.close(pstmt);
		}
	}
	
	public void deleteMovie(Connection conn, int no) throws SQLException {
		PreparedStatement pstmt = null;
		try {
			String sql = "delete from movie where movie_no = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			pstmt.executeUpdate();
		}finally {
			JDBCUtil.close(pstmt);
		}
	}
	

	

}
