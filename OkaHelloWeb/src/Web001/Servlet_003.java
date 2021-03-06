package Web001;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 *四則演算処理(Web_001．問３回答)
 * </p>
 * <p>
 * フォームに入力された文字列で四則演算を行う。
 * </p>
 * 
 * @author EIS 岡智美<br/>
 *         更新履歴<br>
 *         2017/01/14：EIS岡智美：新規作成<br/>
 */

@WebServlet("/Servlet_003")
public class Servlet_003 extends HttpServlet {
  private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_003() {
        super();
        // TODO Auto-generated constructor stub
    }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // doPostメソッドに処理を委譲する。
      this.doPost( request, response );
  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // リクエストのエンコード
      request.setCharacterEncoding( "Windows-31J" );
      // ContentTypeを指定
      response.setContentType( "text/html; charset=Windows-31J" );

      // HTTPレスポンスとして文字列を出力するライター
      PrintWriter pw = response.getWriter();

      // 編集後表示
      pw.println( "<html>" );
      pw.println( "<head>" );
      pw.println( "<title>標準体重</title>" );
      pw.println( "</head>" );
      pw.println( "<body>" );

      // 内容未了　2017/1/13

      

      pw.println( "</body>" );
      pw.println( "</html>" );


  }

}
