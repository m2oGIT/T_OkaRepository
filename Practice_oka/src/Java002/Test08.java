/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * �ۑ� Java��b Java002 Test08 <br />
 * 1~100�̐��l�����[�v�ŉ񂵂āA��̂݉��Z���� <br />
 * �X�V���� 2015/12/05 ���q���F�V�K�쐬 <br />
 * �X�V���� 2015/01/02 ���q���F�����l����o�O�C�� <br />
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
  // 1~100�̓��A��̘a���Z�o���\������B
  public static void main( String[] args ) {
    int j;
    int sum = 0;

    for ( int i = 1; i <= 100; i++ ) {
      j = i % 2;
      if ( j == 1 ) {
        sum = sum + i;
      }
    }

    System.out.println( sum );

  }

}
