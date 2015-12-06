/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * 課題 Java基礎 Java002 Test08 <br />
 * 1~100の数値をループで回して、奇数のみ加算する <br />
 * 更新履歴 2015/12/05 岡智美：新規作成 <br />
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

  public static void main( String[] args ) {
    int i; // ループ用項目
    int j;
    int sum = 0; // 加算累積用項目
    for ( i = 0; i <= 100; i++ ) {    // iの初期値＝1　i≦100の間、iを1ずつ加算しながら{}内処理を実行する。
      j = i % 2;
      if ( j == 1 ) {        // iが奇数の場合
         sum = sum + i; // jにiを加算
      }
    }
    System.out.println( sum ); // 処理結果表示。

  }

}
