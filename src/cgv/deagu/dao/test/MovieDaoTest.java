package cgv.deagu.dao.test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cgv.deagu.dao.MovieDao;
import cgv.deagu.jdbc.DBCPinit;
import cgv.deagu.jdbc.JDBCUtil;
import cgv.deagu.model.Movie;

public class MovieDaoTest {
	Connection conn = null;
	MovieDao dao = null;
	
	@Before
	public void before() {
		try {
			DBCPinit dbcpInit = new DBCPinit();
			dbcpInit.init();
			conn = JDBCUtil.getConnection();
			dao = MovieDao.getInstance();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@After
	public void after() {
		JDBCUtil.close(conn);
	}
	
	@Test
	public void testInsert() throws SQLException {
		Movie movie = new Movie(1,"테스트_영화이름","테스트_영화내용","테스트_영화파일","테스트_영화시간");
		dao.insertMovie(conn, movie);
	}
	
	
	@Test
	public void testList() throws SQLException {
		List<Movie> list = dao.listMovie(conn);
		for(Movie movie : list) {
			System.out.println(movie);
		}
	}
	
	@Test
	public void testSelect() throws SQLException {
		dao.selectByNo(conn, 9);
	}
	
	@Test
	public void testUpdate() throws SQLException {
		Movie movie = new Movie(1, "영화이름", "영화내용", "영화파일", "영화시간");
		dao.updateMovie(conn, movie);
	}
	
	@Test
	public void testDelete() throws SQLException {
		dao.deleteMovie(conn, 1);
	}

	

}
