package s3;

import android.content.SharedPreferences;
/* loaded from: classes.dex */
public final class S {

    /* renamed from: a  reason: collision with root package name */
    public final String f13872a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f13873b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f13874c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ T f13875e;

    public S(T t5, String str, boolean z7) {
        this.f13875e = t5;
        g3.n.c(str);
        this.f13872a = str;
        this.f13873b = z7;
    }

    public final void a(boolean z7) {
        SharedPreferences.Editor edit = this.f13875e.N().edit();
        edit.putBoolean(this.f13872a, z7);
        edit.apply();
        this.d = z7;
    }

    public final boolean b() {
        if (!this.f13874c) {
            this.f13874c = true;
            this.d = this.f13875e.N().getBoolean(this.f13872a, this.f13873b);
        }
        return this.d;
    }
}
