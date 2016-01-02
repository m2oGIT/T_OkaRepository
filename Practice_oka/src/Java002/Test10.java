/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * 課題 Java基礎 Java002 Test10 <br />
 * Test07のaddメソッドを呼び出す。 <br />
 * 更新履歴 2015/12/06 岡智美：新規作成 <br />
 */
public class Test10 {

  /**
   * コンストラクタ <br />
   * デフォルトコンストラクタ <br />
   */
  public Test10() {
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
    // Test07のaddメソッドを呼び出し、戻り値を表示する。

    int sum;

    sum = Test07.add( 5, 20 );

    System.out.println( sum );
  }

}
