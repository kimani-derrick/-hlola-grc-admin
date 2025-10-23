package K;

import android.view.DisplayCutout;
import java.util.Objects;
/* renamed from: K.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0034j {

    /* renamed from: a  reason: collision with root package name */
    public final DisplayCutout f1496a;

    public C0034j(DisplayCutout displayCutout) {
        this.f1496a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0034j.class == obj.getClass()) {
            return Objects.equals(this.f1496a, ((C0034j) obj).f1496a);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        DisplayCutout displayCutout = this.f1496a;
        if (displayCutout != null) {
            hashCode = displayCutout.hashCode();
            return hashCode;
        }
        return 0;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f1496a + "}";
    }
}
