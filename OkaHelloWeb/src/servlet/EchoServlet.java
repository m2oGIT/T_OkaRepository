package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EchoSwevlet
 */
@WebServlet("/EchoServlet")
public class EchoServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EchoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    //�͂��߂Ƀ��N�G�X�g�̃G���R�[�h�����{
    request.setCharacterEncoding( "Windows-31J" );
    
    //ContentType���w��
    response.setContentType( "text/html; charset=Windows-31J" );
    
    
    // HTTP���X�|���X�Ƃ��ĕ�������o�͂��郉�C�^�[
    PrintWriter pw = response.getWriter();
    
      // ��������o�͂���
    pw.println("<html>");
    pw.println("<head>");
    pw.println("<title>EchoServlet</title>");
    pw.println("</head>");
    pw.println("<body>");
    pw.println("<h1><font color=\"red\">Hello Echo Serevlet</font></h1>");

    //index.html����̒l���擾���ĕ\������B
    String params = request.getParameter( "param" );
    pw.println(params);
    
    System.out.println( params );;
    
    pw.println("</body>");
    pw.println("</html>");
    
  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // doGet���\�b�h�ɏ������Ϗ�����
    this.doGet(request,response);
  }

}
