/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * 課題 Java基礎 Java002 Test07 <br />
 * 1~100の数値をループで回して、加算する <br />
 * 更新履歴 2015/12/05 岡智美：新規作成 <br />
 * 更新履歴 2015/12/06 岡智美：addメソッド追加 <br />
 * 更新履歴 2015/01/02 岡智美：初期値相違バグ修正 <br />
 */

public class Test07 {

  /**
   * コンストラクタ <br />
   * デフォルトコンストラクタ <br />
   */
  public Test07() {
    // 行うべき処理なし。
    super();
  }

  /**
   * メインメソッド <br />
   * 処理を起動します。 <br />
   * 
   * @param args 実行時引数
   */
  // 1~100の総和を求め、表示する。
  public static void main( String[] args ) {
    int sum = 0;

    for ( int i = 1; i <= 100; i++ ) {
      sum = sum + i;
    }

    System.out.println( sum );
  }

  /**
   * addメソッド <br />
   * 引数a~引数bの総和を求め、結果を戻り値で返す。 <br />
   * 
   * @param a ：初期値
   * @param b ：加算上限値
   * @return sum ：加算結果
   */
  public static int add( int a, int b ) {
    int sum = 0;

    for ( int i = a; i <= b; i++ ) {
      sum = sum + i;
    }

    return sum;
  }

}
