package T1;

import java.util.Set;
/* loaded from: classes.dex */
public final class s implements Q1.e {

    /* renamed from: a  reason: collision with root package name */
    public final Set f3259a;

    /* renamed from: b  reason: collision with root package name */
    public final i f3260b;

    /* renamed from: c  reason: collision with root package name */
    public final u f3261c;

    public s(Set set, i iVar, u uVar) {
        this.f3259a = set;
        this.f3260b = iVar;
        this.f3261c = uVar;
    }

    public final t a(String str, Q1.b bVar, Q1.d dVar) {
        Set set = this.f3259a;
        if (set.contains(bVar)) {
            return new t(this.f3260b, str, bVar, dVar, this.f3261c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bVar, set));
    }
}
