/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * �ۑ� Java��b Java002 Test07 <br />
 * 1~100�̐��l�����[�v�ŉ񂵂āA���Z���� <br />
 * �X�V���� 2015/12/05 ���q���F�V�K�쐬 <br />
 * �X�V���� 2015/12/06 ���q���Fadd���\�b�h�ǉ� <br />
 * �X�V���� 2015/01/02 ���q���F�����l����o�O�C�� <br />
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
  // 1~100�̑��a�����߁A�\������B
  public static void main( String[] args ) {
    int sum = 0;

    for ( int i = 1; i <= 100; i++ ) {
      sum = sum + i;
    }

    System.out.println( sum );
  }

  /**
   * add���\�b�h <br />
   * ����a~����b�̑��a�����߁A���ʂ�߂�l�ŕԂ��B <br />
   * 
   * @param a �F�����l
   * @param b �F���Z����l
   * @return sum �F���Z����
   */
  public static int add( int a, int b ) {
    int sum = 0;

    for ( int i = a; i <= b; i++ ) {
      sum = sum + i;
    }

    return sum;
  }

}
