package T0;

import android.content.Context;
import android.util.DisplayMetrics;
/* loaded from: classes.dex */
public final class c implements g {

    /* renamed from: a  reason: collision with root package name */
    public final Context f3202a;

    public c(Context context) {
        this.f3202a = context;
    }

    @Override // T0.g
    public final Object a(J0.g gVar) {
        DisplayMetrics displayMetrics = this.f3202a.getResources().getDisplayMetrics();
        a aVar = new a(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new f(aVar, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            if (M5.g.a(this.f3202a, ((c) obj).f3202a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3202a.hashCode();
    }
}
