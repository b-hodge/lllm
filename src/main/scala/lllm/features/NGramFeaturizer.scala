package lllm.features

/**
 * @author jda
 */
case class NGramFeaturizer(minOrder: Int, maxOrder: Int) extends Featurizer {

  override def apply(arg: IndexedSeq[String]): Iterable[String] = {
    (minOrder to maxOrder) map { arg.takeRight(_).mkString("__") }
  }

}