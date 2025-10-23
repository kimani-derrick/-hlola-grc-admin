package androidx.activity.result;

import java.util.HashMap;
import p6.l;
/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5358a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f5359b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ l f5360c;
    public final /* synthetic */ g d;

    public /* synthetic */ d(g gVar, String str, l lVar, int i7) {
        this.f5358a = i7;
        this.d = gVar;
        this.f5359b = str;
        this.f5360c = lVar;
    }

    @Override // androidx.activity.result.c
    public final void a(Object obj) {
        switch (this.f5358a) {
            case 0:
                g gVar = this.d;
                HashMap hashMap = gVar.f5366b;
                String str = this.f5359b;
                Integer num = (Integer) hashMap.get(str);
                l lVar = this.f5360c;
                if (num != null) {
                    gVar.d.add(str);
                    try {
                        gVar.b(num.intValue(), lVar, obj);
                        return;
                    } catch (Exception e3) {
                        gVar.d.remove(str);
                        throw e3;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + lVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            default:
                g gVar2 = this.d;
                HashMap hashMap2 = gVar2.f5366b;
                String str2 = this.f5359b;
                Integer num2 = (Integer) hashMap2.get(str2);
                l lVar2 = this.f5360c;
                if (num2 != null) {
                    gVar2.d.add(str2);
                    try {
                        gVar2.b(num2.intValue(), lVar2, obj);
                        return;
                    } catch (Exception e7) {
                        gVar2.d.remove(str2);
                        throw e7;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + lVar2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }
    }

    public void b() {
        this.d.f(this.f5359b);
    }
}
