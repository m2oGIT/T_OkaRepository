/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * �ۑ� Java��b Java002 Test09 <br />
 * 1~�����̐��l�����[�v�ŉ񂵂āA���Z���� <br />
 * �X�V���� 2015/12/05 ���q���F�V�K�쐬 <br />
 * �X�V���� 2015/01/02 ���q���F�����l����o�O�C�� <br />
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
  // 1~���s�������܂ł̑��a��\������B
  public static void main( String[] args ) {
    int sum = 0;
    int lmt = Integer.parseInt( args[0] );
    // ���s�������𐔎��^�ɕϊ����A����l�Ƃ��Đݒ�

    for ( int i = 1; i <= lmt; i++ ) {
      sum = sum + i;
    }

    System.out.println( sum );
  }

}
