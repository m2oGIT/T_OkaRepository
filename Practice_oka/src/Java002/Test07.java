/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * �ۑ� Java��b Java002 Test07 <br />
 * 1~100�̐��l�����[�v�ŉ񂵂āA���Z���� <br />
 * �X�V���� 2015/12/05 ���q���F�V�K�쐬 <br />
 * �X�V���� 2015/12/06 ���q���Fadd���\�b�h�ǉ� <br />
 */

public class Test07 {
  
  /**
   * �R���X�g���N�^ <br />
   * �f�t�H���g�R���X�g���N�^ <br />
   */
  public Test07() {
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
    int i; // ���[�v�p����
    int sum = 0; // ���Z�ݐϗp����
    for ( i = 0; i <= 100; i++ ) { // i�̏����l��1�@i��100�̊ԁAi��1�����Z���Ȃ���{}�����������s����B
      sum = sum + i;
    }
    System.out.println( sum ); // �������ʕ\���B
  }

  /**
   * add���\�b�h <br />
   * a~b�̐�����S�ĉ��Z���A���ʂ�߂�l�ŕԂ��܂��B <br />
   */
  public static int add( int a, int b ) {
    int sum = 0; // ���Z�ݐϗp����
    for ( a = 0; a <= b; a++ ) { // i�̏����l��1�@i��100�̊ԁAi��1�����Z���Ȃ���{}�����������s����B
      sum = sum + a;
    }
    return sum;
  }

}
