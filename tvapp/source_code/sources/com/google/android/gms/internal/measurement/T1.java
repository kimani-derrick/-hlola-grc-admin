package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import java.util.Iterator;
/* loaded from: classes.dex */
public final /* synthetic */ class T1 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ U1 f8424a;

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        U1 u12 = this.f8424a;
        synchronized (u12.f8432t) {
            u12.f8433u = null;
            u12.f8430r.run();
        }
        synchronized (u12) {
            try {
                Iterator it = u12.f8434v.iterator();
                if (it.hasNext()) {
                    AbstractC0515y1.v(it.next());
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
