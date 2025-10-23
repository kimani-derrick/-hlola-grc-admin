package T4;

import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f3376a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3377b;

    public a(String str, String str2) {
        if (str != null) {
            this.f3376a = str;
            if (str2 != null) {
                this.f3377b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f3376a.equals(aVar.f3376a) && this.f3377b.equals(aVar.f3377b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f3376a.hashCode() ^ 1000003) * 1000003) ^ this.f3377b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.f3376a);
        sb.append(", version=");
        return AbstractC1111a.t(sb, this.f3377b, "}");
    }
}
