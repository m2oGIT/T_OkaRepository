/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * �ۑ� Java��b Java002 Test10 <br />
 * Test07��add���\�b�h���Ăяo���B <br />
 * �X�V���� 2015/12/06 ���q���F�V�K�쐬 <br />
 */
public class Test10 {

  /**
   * �R���X�g���N�^ <br />
   * �f�t�H���g�R���X�g���N�^ <br />
   */
  public Test10() {
    // �s���ׂ������Ȃ��B
    super();
  }

  /**
   * ���C�����\�b�h <br />
   * �������N�����܂��B <br />
   * 
   * @param args ���s������
   */
  public static void main( String[] args ) {
    // Test07��add���\�b�h���Ăяo���A�߂�l��\������B

    int sum;

    sum = Test07.add( 5, 20 );

    System.out.println( sum );
  }

}
