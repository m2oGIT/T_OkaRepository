/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * �ۑ� Java��b Java002 Test09 <br />
 * 1~�����̐��l�����[�v�ŉ񂵂āA���Z���� <br />
 * �X�V���� 2015/12/05 ���q���F�V�K�쐬 <br />
 */

public class Test09 {
  
  /**
   * �R���X�g���N�^ <br />
   * �f�t�H���g�R���X�g���N�^ <br />
   */
  public Test09() {
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
    int lmt = Integer.parseInt( args[0] );
    // �����𐔎��^�ɕϊ����A����l�ɐݒ�

    for ( i = 0; i <= lmt; i++ ) { // i�̏����l��1�@i�������̊ԁAi��1�����Z���Ȃ���{}�����������s����B
      sum = sum + i;
    }
    System.out.println( sum ); // �������ʕ\���B
  }

}
