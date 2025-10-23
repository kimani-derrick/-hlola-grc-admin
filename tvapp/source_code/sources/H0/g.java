package H0;

import android.animation.TypeEvaluator;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
/* loaded from: classes.dex */
public final class g implements TypeEvaluator {

    /* renamed from: a  reason: collision with root package name */
    public static final g f821a = new Object();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        float f7 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
        float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        float g7 = AbstractC0515y1.g(((intValue2 >> 24) & 255) / 255.0f, f7, f, f7);
        float g8 = AbstractC0515y1.g(pow4, pow, f, pow);
        float g9 = AbstractC0515y1.g((float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d), pow2, f, pow2);
        float g10 = AbstractC0515y1.g((float) Math.pow((intValue2 & 255) / 255.0f, 2.2d), pow3, f, pow3);
        int round = Math.round(((float) Math.pow(g8, 0.45454545454545453d)) * 255.0f) << 16;
        return Integer.valueOf(Math.round(((float) Math.pow(g10, 0.45454545454545453d)) * 255.0f) | round | (Math.round(g7 * 255.0f) << 24) | (Math.round(((float) Math.pow(g9, 0.45454545454545453d)) * 255.0f) << 8));
    }
}
