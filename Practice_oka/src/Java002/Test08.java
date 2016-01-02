/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * 課題 Java基礎 Java002 Test08 <br />
 * 1~100の数値をループで回して、奇数のみ加算する <br />
 * 更新履歴 2015/12/05 岡智美：新規作成 <br />
 * 更新履歴 2015/01/02 岡智美：初期値相違バグ修正 <br />
 */

public class Test08 {

  /**
   * コンストラクタ <br />
   * デフォルトコンストラクタ <br />
   */
  public Test08() {
    // 行うべき処理なし。
    super();
  }

  /**
   * メインメソッド <br />
   * 処理を起動します。 <br />
   * 
   * @param args 実行時引数
   */
  // 1~100の内、奇数の和を算出し表示する。
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
