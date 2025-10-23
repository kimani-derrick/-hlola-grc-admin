package u4;

import java.util.Objects;
import z4.C1518b;
/* renamed from: u4.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1287k {

    /* renamed from: a  reason: collision with root package name */
    public final v f15006a;

    /* renamed from: b  reason: collision with root package name */
    public final C1286j f15007b;

    public C1287k(v vVar, C1518b c1518b) {
        this.f15006a = vVar;
        this.f15007b = new C1286j(c1518b);
    }

    public final void a(String str) {
        C1286j c1286j = this.f15007b;
        synchronized (c1286j) {
            if (!Objects.equals(c1286j.f15003q, str)) {
                C1286j.a((C1518b) c1286j.f15004r, str, (String) c1286j.f15005s);
                c1286j.f15003q = str;
            }
        }
    }
}
