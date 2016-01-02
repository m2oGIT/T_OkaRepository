/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * 課題 Java基礎 Java002 Test09 <br />
 * 1~引数の数値をループで回して、加算する <br />
 * 更新履歴 2015/12/05 岡智美：新規作成 <br />
 * 更新履歴 2015/01/02 岡智美：初期値相違バグ修正 <br />
 */

public class Test09 {

  /**
   * コンストラクタ <br />
   * デフォルトコンストラクタ <br />
   */
  public Test09() {
    // 行うべき処理なし。
    super();
  }

  /**
   * メインメソッド <br />
   * 処理を起動します。 <br />
   * 
   * @param args 実行時引数
   */
  // 1~実行時引数までの総和を表示する。
  public static void main( String[] args ) {
    int sum = 0;
    int lmt = Integer.parseInt( args[0] );
    // 実行時引数を数字型に変換し、上限値として設定

    for ( int i = 1; i <= lmt; i++ ) {
      sum = sum + i;
    }

    System.out.println( sum );
  }

}
