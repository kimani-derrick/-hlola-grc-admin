package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import l3.BinderC0971b;
/* renamed from: com.google.android.gms.internal.measurement.q0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0475q0 extends AbstractRunnableC0415e0 {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f8647u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f8648v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f8649w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Object f8650x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0475q0(C0420f0 c0420f0, Activity activity, T t5) {
        super(c0420f0.f8555q, true);
        this.f8647u = 3;
        this.f8648v = activity;
        this.f8650x = t5;
        this.f8649w = c0420f0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0415e0
    public final void a() {
        Bundle bundle;
        switch (this.f8647u) {
            case 0:
                V v5 = ((C0430h0) this.f8649w).f8571h;
                g3.n.g(v5);
                v5.logHealthData(5, (String) this.f8648v, new BinderC0971b(this.f8650x), new BinderC0971b(null), new BinderC0971b(null));
                return;
            case 1:
                V v7 = ((C0430h0) this.f8649w).f8571h;
                g3.n.g(v7);
                v7.getMaxUserProperties((String) this.f8648v, (T) this.f8650x);
                return;
            case 2:
                if (((Bundle) this.f8648v) != null) {
                    bundle = new Bundle();
                    if (((Bundle) this.f8648v).containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = ((Bundle) this.f8648v).get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                } else {
                    bundle = null;
                }
                V v8 = ((C0420f0) this.f8649w).f8555q.f8571h;
                g3.n.g(v8);
                v8.onActivityCreated(new BinderC0971b((Activity) this.f8650x), bundle, this.f8545r);
                return;
            default:
                V v9 = ((C0420f0) this.f8649w).f8555q.f8571h;
                g3.n.g(v9);
                v9.onActivitySaveInstanceState(new BinderC0971b((Activity) this.f8648v), (T) this.f8650x, this.f8545r);
                return;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0415e0
    public void b() {
        switch (this.f8647u) {
            case 1:
                ((T) this.f8650x).d(null);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0475q0(C0420f0 c0420f0, Bundle bundle, Activity activity) {
        super(c0420f0.f8555q, true);
        this.f8647u = 2;
        this.f8648v = bundle;
        this.f8650x = activity;
        this.f8649w = c0420f0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0475q0(C0430h0 c0430h0, Object obj) {
        super(c0430h0, false);
        this.f8647u = 0;
        this.f8648v = "Error with data collection. Data lost.";
        this.f8650x = obj;
        this.f8649w = c0430h0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0475q0(C0430h0 c0430h0, String str, T t5) {
        super(c0430h0, true);
        this.f8647u = 1;
        this.f8648v = str;
        this.f8650x = t5;
        this.f8649w = c0430h0;
    }
}
