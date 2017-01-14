
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
 * �W���̏d�Z�o����(Web_001�D��Q��)
 * </p>
 * <p>
 * �t�H�[���ɓ��͂��ꂽ������𔽕��\������B
 * </p>
 * 
 * @author EIS ���q��<br/>
 *         �X�V����<br>
 *         2017/01/14�FEIS���q���F�V�K�쐬<br/>
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
    // doPost���\�b�h�ɏ������Ϗ�����B
    this.doPost( request, response );
  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doPost( HttpServletRequest request, HttpServletResponse response )
      throws ServletException, IOException {
    // ���N�G�X�g�̃G���R�[�h
    request.setCharacterEncoding( "Windows-31J" );
    // ContentType���w��
    response.setContentType( "text/html; charset=Windows-31J" );

    // HTTP���X�|���X�Ƃ��ĕ�������o�͂��郉�C�^�[
    PrintWriter pw = response.getWriter();

    // �ҏW��\��
    pw.println( "<html>" );
    pw.println( "<head>" );
    pw.println( "<title>�W���̏d</title>" );
    pw.println( "</head>" );
    pw.println( "<body>" );

    // view_002.html����̒l���擾���A�W���̏d���Z�o���ĕԂ��B
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
