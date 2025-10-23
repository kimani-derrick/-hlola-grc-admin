package U5;

import L5.p;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class c implements T5.h {

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f3483a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3484b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3485c;
    public final p d;

    public c(CharSequence charSequence, int i7, int i8, p pVar) {
        M5.g.f(charSequence, "input");
        this.f3483a = charSequence;
        this.f3484b = i7;
        this.f3485c = i8;
        this.d = pVar;
    }

    @Override // T5.h
    public final Iterator iterator() {
        return new b(this);
    }
}
