/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * �ۑ� Java��b Java002 Test08 <br />
 * 1~100�̐��l�����[�v�ŉ񂵂āA��̂݉��Z���� <br />
 * �X�V���� 2015/12/05 ���q���F�V�K�쐬 <br />
 */

public class Test08 {
  
  /**
   * �R���X�g���N�^ <br />
   * �f�t�H���g�R���X�g���N�^ <br />
   */
  public Test08() {
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
    int j;
    int sum = 0; // ���Z�ݐϗp����
    for ( i = 0; i <= 100; i++ ) {    // i�̏����l��1�@i��100�̊ԁAi��1�����Z���Ȃ���{}�����������s����B
      j = i % 2;
      if ( j == 1 ) {        // i����̏ꍇ
         sum = sum + i; // j��i�����Z
      }
    }
    System.out.println( sum ); // �������ʕ\���B

  }

}
