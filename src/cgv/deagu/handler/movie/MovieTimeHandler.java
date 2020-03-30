package cgv.deagu.handler.movie;

import java.sql.Connection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cgv.deagu.dao.MovieDao;
import cgv.deagu.jdbc.JDBCUtil;
import cgv.deagu.model.Movie;
import cgv.deagu.mvc.CommandHandler;

public class MovieTimeHandler implements CommandHandler{

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		if(req.getMethod().equalsIgnoreCase("get")) {
			Connection conn = null;
			try {
				conn = JDBCUtil.getConnection();
				MovieDao dao = MovieDao.getInstance();
				List<Movie> list = dao.listMovie(conn);
				req.setAttribute("list", list);
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				JDBCUtil.close(conn);
			}
		return "/WEB-INF/view/movie/menu2.jsp";
	}
		return null;
	}

}
