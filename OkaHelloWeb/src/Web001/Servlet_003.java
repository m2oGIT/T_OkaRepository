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
 *�l�����Z����(Web_001�D��R��)
 * </p>
 * <p>
 * �t�H�[���ɓ��͂��ꂽ������Ŏl�����Z���s���B
 * </p>
 * 
 * @author EIS ���q��<br/>
 *         �X�V����<br>
 *         2017/01/14�FEIS���q���F�V�K�쐬<br/>
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
      // doPost���\�b�h�ɏ������Ϗ�����B
      this.doPost( request, response );
  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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

      // ���e�����@2017/1/13

      

      pw.println( "</body>" );
      pw.println( "</html>" );


  }

}
