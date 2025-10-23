package c4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: c4.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0392a {

    /* renamed from: b  reason: collision with root package name */
    public static final C0392a f7269b = new C0392a(Collections.unmodifiableMap(new HashMap()));

    /* renamed from: a  reason: collision with root package name */
    public final Map f7270a;

    public C0392a(Map map) {
        this.f7270a = map;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0392a)) {
            return false;
        }
        return this.f7270a.equals(((C0392a) obj).f7270a);
    }

    public final int hashCode() {
        return this.f7270a.hashCode();
    }

    public final String toString() {
        return this.f7270a.toString();
    }
}
