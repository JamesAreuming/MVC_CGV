package cgv.deagu.handler.movie;

import java.io.File;
import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import cgv.deagu.dao.MovieDao;
import cgv.deagu.jdbc.JDBCUtil;
import cgv.deagu.model.Movie;
import cgv.deagu.mvc.CommandHandler;

public class MovieFormHandler  implements CommandHandler{

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		if(req.getMethod().equalsIgnoreCase("get")) {
			return "/WEB-INF/view/movie/movieForm.jsp";
		}else if(req.getMethod().equalsIgnoreCase("post")) {
			String uploadPath = req.getRealPath("movieIMG");
			File dir = new File(uploadPath);
			
			if(dir.exists() == false) {
				dir.mkdir();
			}
			System.out.println(uploadPath);
			
			int size = 1024*1024*10;
			
			MultipartRequest multi = new MultipartRequest(req,uploadPath,size,"UTF-8", new DefaultFileRenamePolicy());
			
			Connection conn = null;
			
			try {
				conn = JDBCUtil.getConnection();
				
				MovieDao dao = MovieDao.getInstance();
				//form의 name
				Movie movie = new Movie(0, multi.getParameter("name"), multi.getParameter("content"), multi.getFilesystemName("file"), multi.getParameter("showTime"));
				
				dao.insertMovie(conn, movie);
				res.sendRedirect(req.getContextPath()+"/movie/list.do");
				return null;
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				JDBCUtil.close(conn);
			}
		}
		return null;
	}

}
