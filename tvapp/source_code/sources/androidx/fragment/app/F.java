package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;
/* loaded from: classes.dex */
public final class F implements androidx.activity.result.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5887a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ S f5888b;

    public /* synthetic */ F(S s6, int i7) {
        this.f5887a = i7;
        this.f5888b = s6;
    }

    @Override // androidx.activity.result.b
    public final void a(Object obj) {
        int i7;
        switch (this.f5887a) {
            case 0:
                Map map = (Map) obj;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i8 = 0; i8 < arrayList.size(); i8++) {
                    if (((Boolean) arrayList.get(i8)).booleanValue()) {
                        i7 = 0;
                    } else {
                        i7 = -1;
                    }
                    iArr[i8] = i7;
                }
                S s6 = this.f5888b;
                L l7 = (L) s6.f5913E.pollFirst();
                if (l7 == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    return;
                }
                C4.b bVar = s6.f5925c;
                String str = l7.f5900q;
                if (bVar.v(str) == null) {
                    Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    return;
                }
                return;
            case 1:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                S s7 = this.f5888b;
                L l8 = (L) s7.f5913E.pollLast();
                if (l8 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    return;
                }
                C4.b bVar2 = s7.f5925c;
                String str2 = l8.f5900q;
                ComponentCallbacksC0269x v5 = bVar2.v(str2);
                if (v5 == null) {
                    Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                    return;
                }
                v5.D(l8.f5901r, aVar.f5356q, aVar.f5357r);
                return;
            default:
                androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                S s8 = this.f5888b;
                L l9 = (L) s8.f5913E.pollFirst();
                if (l9 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    return;
                }
                C4.b bVar3 = s8.f5925c;
                String str3 = l9.f5900q;
                ComponentCallbacksC0269x v7 = bVar3.v(str3);
                if (v7 == null) {
                    Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                    return;
                }
                v7.D(l9.f5901r, aVar2.f5356q, aVar2.f5357r);
                return;
        }
    }
}
