package r4;

import A5.m;
import H.j;
import M5.g;
import Y4.d;
import Y4.e;
import android.util.Log;
import java.util.ArrayList;
import java.util.Set;
import k.V0;
import v4.AbstractC1335m;
import v4.C1324b;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final V0 f13479a;

    public b(V0 v02) {
        this.f13479a = v02;
    }

    public final void a(d dVar) {
        String str;
        g.f(dVar, "rolloutsState");
        V0 v02 = this.f13479a;
        Set<e> set = dVar.f4498a;
        g.e(set, "rolloutsState.rolloutAssignments");
        ArrayList arrayList = new ArrayList(m.P(set));
        for (e eVar : set) {
            Y4.c cVar = (Y4.c) eVar;
            String str2 = cVar.f4495b;
            String str3 = cVar.d;
            String str4 = cVar.f4497e;
            String str5 = cVar.f4496c;
            long j7 = cVar.f;
            T4.c cVar2 = AbstractC1335m.f15353a;
            if (str4.length() > 256) {
                str = str4.substring(0, 256);
            } else {
                str = str4;
            }
            arrayList.add(new C1324b(str2, str3, str, str5, j7));
        }
        synchronized (((j) v02.f)) {
            try {
                if (((j) v02.f).r(arrayList)) {
                    ((C4.b) v02.f11961b).X(new U4.c(v02, 2, ((j) v02.f).n()));
                }
            } finally {
            }
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Updated Crashlytics Rollout State", null);
        }
    }
}
