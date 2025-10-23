package X0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import coil.target.GenericViewTarget;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final S0.a f4057a = new S0.a();

    public static final boolean a(S0.g gVar) {
        int b7 = s.h.b(gVar.f3012I);
        if (b7 == 0) {
            return false;
        }
        if (b7 != 1) {
            if (b7 == 2) {
                T0.g gVar2 = gVar.f3010G.f2952b;
                T0.g gVar3 = gVar.f3037x;
                if (gVar2 != null || !(gVar3 instanceof T0.c)) {
                    GenericViewTarget genericViewTarget = gVar.f3019c;
                    if (!(genericViewTarget instanceof GenericViewTarget) || !(gVar3 instanceof T0.e) || !(genericViewTarget.k() instanceof ImageView) || genericViewTarget.k() != ((T0.e) gVar3).f3204a) {
                        return false;
                    }
                }
            } else {
                throw new RuntimeException();
            }
        }
        return true;
    }

    public static final Drawable b(S0.g gVar, Drawable drawable, Integer num, Drawable drawable2) {
        if (drawable == null) {
            if (num != null) {
                if (num.intValue() == 0) {
                    return null;
                }
                Context context = gVar.f3017a;
                int intValue = num.intValue();
                Drawable i02 = android.support.v4.media.session.b.i0(context, intValue);
                if (i02 != null) {
                    return i02;
                }
                throw new IllegalStateException(AbstractC0515y1.l("Invalid resource ID: ", intValue).toString());
            }
            return drawable2;
        }
        return drawable;
    }
}
