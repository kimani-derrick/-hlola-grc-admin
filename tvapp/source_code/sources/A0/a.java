package A0;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet f4a;

    public a(e eVar) {
        M5.g.f(eVar, "registry");
        this.f4a = new LinkedHashSet();
        eVar.d("androidx.savedstate.Restarter", this);
    }

    @Override // A0.d
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f4a));
        return bundle;
    }
}
