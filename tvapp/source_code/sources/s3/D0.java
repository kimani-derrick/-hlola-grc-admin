package s3;

import android.content.SharedPreferences;
/* loaded from: classes.dex */
public final /* synthetic */ class D0 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ C1212z0 f13762a;

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        C1212z0 c1212z0 = this.f13762a;
        c1212z0.getClass();
        if ("IABTCF_TCString".equals(str)) {
            c1212z0.b().f13803D.d("IABTCF_TCString change picked up in listener.");
            E0 e02 = c1212z0.f14406J;
            g3.n.g(e02);
            e02.b(500L);
        }
    }
}
