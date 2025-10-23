package androidx.activity;

import android.os.Bundle;
import androidx.fragment.app.C0271z;
import c.InterfaceC0385a;
import java.util.ArrayList;
import java.util.HashMap;
/* loaded from: classes.dex */
public final /* synthetic */ class f implements InterfaceC0385a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5311a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l f5312b;

    public /* synthetic */ f(q1.g gVar, int i7) {
        this.f5311a = i7;
        this.f5312b = gVar;
    }

    @Override // c.InterfaceC0385a
    public final void a() {
        switch (this.f5311a) {
            case 0:
                l lVar = this.f5312b;
                Bundle b7 = ((A0.e) lVar.f5333u.f13c).b("android:support:activity-result");
                if (b7 != null) {
                    h hVar = lVar.f5323A;
                    hVar.getClass();
                    ArrayList<Integer> integerArrayList = b7.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = b7.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        hVar.d = b7.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        Bundle bundle = b7.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        Bundle bundle2 = hVar.f5369g;
                        bundle2.putAll(bundle);
                        for (int i7 = 0; i7 < stringArrayList.size(); i7++) {
                            String str = stringArrayList.get(i7);
                            HashMap hashMap = hVar.f5366b;
                            boolean containsKey = hashMap.containsKey(str);
                            HashMap hashMap2 = hVar.f5365a;
                            if (containsKey) {
                                Integer num = (Integer) hashMap.remove(str);
                                if (!bundle2.containsKey(str)) {
                                    hashMap2.remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i7);
                            num2.intValue();
                            String str2 = stringArrayList.get(i7);
                            hashMap2.put(num2, str2);
                            hashMap.put(str2, num2);
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                C0271z c0271z = (C0271z) ((q1.g) this.f5312b).f13229I.f4918q;
                c0271z.f6149u.b(c0271z, c0271z, null);
                return;
        }
    }
}
