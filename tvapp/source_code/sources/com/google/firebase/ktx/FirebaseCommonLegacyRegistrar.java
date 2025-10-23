package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import m3.g;
import o4.C1069a;
@Keep
/* loaded from: classes.dex */
public final class FirebaseCommonLegacyRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1069a> getComponents() {
        return g.z(g.h("fire-core-ktx", "21.0.0"));
    }
}
