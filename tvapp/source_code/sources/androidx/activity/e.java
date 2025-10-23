package androidx.activity;

import android.os.Bundle;
import androidx.fragment.app.S;
import androidx.lifecycle.EnumC0336n;
import androidx.lifecycle.N;
import java.util.ArrayList;
import java.util.HashMap;
/* loaded from: classes.dex */
public final /* synthetic */ class e implements A0.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5309a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f5310b;

    public /* synthetic */ e(int i7, Object obj) {
        this.f5309a = i7;
        this.f5310b = obj;
    }

    @Override // A0.d
    public final Bundle a() {
        q1.g gVar;
        switch (this.f5309a) {
            case 0:
                l lVar = (l) this.f5310b;
                lVar.getClass();
                Bundle bundle = new Bundle();
                h hVar = lVar.f5323A;
                hVar.getClass();
                HashMap hashMap = hVar.f5366b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(hashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(hashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(hVar.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) hVar.f5369g.clone());
                return bundle;
            case 1:
                break;
            case 2:
                return ((S) this.f5310b).a0();
            default:
                return N.a((N) this.f5310b);
        }
        do {
            gVar = (q1.g) this.f5310b;
        } while (q1.g.X(gVar.W()));
        gVar.f13230J.G(EnumC0336n.ON_STOP);
        return new Bundle();
    }
}
