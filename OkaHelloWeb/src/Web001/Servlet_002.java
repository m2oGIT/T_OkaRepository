
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
 * 標準体重算出処理(Web_001．問２回答)
 * </p>
 * <p>
 * フォームに入力された文字列を反復表示する。
 * </p>
 * 
 * @author EIS 岡智美<br/>
 *         更新履歴<br>
 *         2017/01/14：EIS岡智美：新規作成<br/>
 */

@WebServlet("/Web001/Servlet_002")
public class Servlet_002 extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#HttpServlet()
   */
  public Servlet_002() {
    super();
    // TODO Auto-generated constructor stub
  }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doGet( HttpServletRequest request, HttpServletResponse response )
      throws ServletException, IOException {
    // doPostメソッドに処理を委譲する。
    this.doPost( request, response );
  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doPost( HttpServletRequest request, HttpServletResponse response )
      throws ServletException, IOException {
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

    // view_002.htmlからの値を取得し、標準体重を算出して返す。
    String paramhight = request.getParameter( "paramhight" );

    String[] hightocc = paramhight.split( ",", 0 );

    for ( int i = 0; i < hightocc.length; i++ ) {
      int hight = Integer.parseInt( hightocc[i] );

      double weight = ( hight - 100 ) * 0.9;

      pw.println( weight );
      pw.println( "<br>" );

      System.out.println( weight );

    }

    pw.println( "</body>" );
    pw.println( "</html>" );

  }

}
