package w4;

import java.util.List;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class F extends k0 {

    /* renamed from: a  reason: collision with root package name */
    public final List f15892a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15893b;

    public F(String str, List list) {
        this.f15892a = list;
        this.f15893b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (this.f15892a.equals(((F) k0Var).f15892a)) {
            String str = this.f15893b;
            String str2 = ((F) k0Var).f15893b;
            if (str == null) {
                if (str2 == null) {
                    return true;
                }
            } else if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f15892a.hashCode() ^ 1000003) * 1000003;
        String str = this.f15893b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.f15892a);
        sb.append(", orgId=");
        return AbstractC1111a.t(sb, this.f15893b, "}");
    }
}
