import org.gradle.fairy.tales.bears.GoldilocksAndTheThreeBears;

module org.gradle.fairy.tales.bears {
    requires org.gradle.fairy.tales.actors;
    requires transitive org.gradle.fairy.tales.tale;
    requires org.gradle.fairy.tales.formula;

    provides org.gradle.fairy.tales.tale.Tale
        with GoldilocksAndTheThreeBears;
}
