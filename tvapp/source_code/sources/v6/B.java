package v6;

import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public abstract class B {

    /* renamed from: a  reason: collision with root package name */
    public static final A f15359a = new A(new byte[0], 0, 0, false);

    /* renamed from: b  reason: collision with root package name */
    public static final int f15360b;

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicReference[] f15361c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f15360b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i7 = 0; i7 < highestOneBit; i7++) {
            atomicReferenceArr[i7] = new AtomicReference();
        }
        f15361c = atomicReferenceArr;
    }

    public static final void a(A a7) {
        int i7;
        if (a7.f == null && a7.f15358g == null) {
            if (a7.d) {
                return;
            }
            AtomicReference atomicReference = f15361c[(int) (Thread.currentThread().getId() & (f15360b - 1))];
            A a8 = f15359a;
            A a9 = (A) atomicReference.getAndSet(a8);
            if (a9 == a8) {
                return;
            }
            if (a9 != null) {
                i7 = a9.f15356c;
            } else {
                i7 = 0;
            }
            if (i7 >= 65536) {
                atomicReference.set(a9);
                return;
            }
            a7.f = a9;
            a7.f15355b = 0;
            a7.f15356c = i7 + 8192;
            atomicReference.set(a7);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final A b() {
        AtomicReference atomicReference = f15361c[(int) (Thread.currentThread().getId() & (f15360b - 1))];
        A a7 = f15359a;
        A a8 = (A) atomicReference.getAndSet(a7);
        if (a8 == a7) {
            return new A();
        }
        if (a8 == null) {
            atomicReference.set(null);
            return new A();
        }
        atomicReference.set(a8.f);
        a8.f = null;
        a8.f15356c = 0;
        return a8;
    }
}
