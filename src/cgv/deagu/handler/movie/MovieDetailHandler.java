package cgv.deagu.handler.movie;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cgv.deagu.dao.MovieDao;
import cgv.deagu.jdbc.JDBCUtil;
import cgv.deagu.model.Movie;
import cgv.deagu.mvc.CommandHandler;

public class MovieDetailHandler implements CommandHandler{

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		if(req.getMethod().equalsIgnoreCase("get")) {
			String Mno = req.getParameter("no");
			int no = Integer.parseInt(Mno);
			
			Connection conn = null;
			try {
				conn = JDBCUtil.getConnection();
				MovieDao dao = MovieDao.getInstance();
				Movie movie = dao.selectByNo(conn, no);
				req.setAttribute("detail", movie);
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				JDBCUtil.close(conn);
			}
			return "/WEB-INF/view/movie/movieDetail.jsp";
		}
		return null;
	}

}
