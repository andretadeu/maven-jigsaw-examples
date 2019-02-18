import com.andretadeu.fairy.tales.pigs.ThreeLittlePigs;

module com.andretadeu.fairy.tales.pigs {
    requires com.andretadeu.fairy.tales.actors;
    requires transitive com.andretadeu.fairy.tales.tale;
    requires com.andretadeu.fairy.tales.formula;

    provides com.andretadeu.fairy.tales.tale.Tale
            with ThreeLittlePigs;
}
