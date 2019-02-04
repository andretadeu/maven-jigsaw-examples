import org.gradle.fairy.tales.pigs.ThreeLittlePigs;

module org.gradle.fairy.tales.pigs {
    requires org.gradle.fairy.tales.actors;
    requires transitive org.gradle.fairy.tales.tale;
    requires org.gradle.fairy.tales.formula;

    provides org.gradle.fairy.tales.tale.Tale
            with ThreeLittlePigs;
}
