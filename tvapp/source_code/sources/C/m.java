package C;

import android.content.res.Resources;
import java.util.Objects;
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final Resources f338a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources.Theme f339b;

    public m(Resources resources, Resources.Theme theme) {
        this.f338a = resources;
        this.f339b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f338a.equals(mVar.f338a) && Objects.equals(this.f339b, mVar.f339b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f338a, this.f339b);
    }
}
