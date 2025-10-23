package n5;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
/* loaded from: classes.dex */
public final class y {
    public static final ArrayList d;

    /* renamed from: a  reason: collision with root package name */
    public final List f12759a;

    /* renamed from: b  reason: collision with root package name */
    public final ThreadLocal f12760b = new ThreadLocal();

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f12761c = new LinkedHashMap();

    static {
        ArrayList arrayList = new ArrayList(5);
        d = arrayList;
        arrayList.add(AbstractC1043D.f12672a);
        arrayList.add(h.f12700c);
        arrayList.add(C1045b.f12681e);
        arrayList.add(C1045b.d);
        arrayList.add(z.f12762a);
        arrayList.add(g.d);
    }

    public y(h6.q qVar) {
        ArrayList arrayList = qVar.f11194a;
        int size = arrayList.size();
        ArrayList arrayList2 = d;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size);
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        this.f12759a = Collections.unmodifiableList(arrayList3);
    }

    public final k a(Class cls) {
        return c(cls, o5.e.f12957a, null);
    }

    public final k b(Type type, Set set) {
        return c(type, set, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4, types: [n5.k] */
    public final k c(Type type, Set set, String str) {
        Object asList;
        w wVar;
        if (type != null) {
            if (set != null) {
                Type a7 = o5.e.a(type);
                if (a7 instanceof WildcardType) {
                    WildcardType wildcardType = (WildcardType) a7;
                    if (wildcardType.getLowerBounds().length == 0) {
                        Type[] upperBounds = wildcardType.getUpperBounds();
                        if (upperBounds.length == 1) {
                            a7 = upperBounds[0];
                        } else {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                if (set.isEmpty()) {
                    asList = a7;
                } else {
                    asList = Arrays.asList(a7, set);
                }
                synchronized (this.f12761c) {
                    try {
                        k kVar = (k) this.f12761c.get(asList);
                        if (kVar != null) {
                            return kVar;
                        }
                        x xVar = (x) this.f12760b.get();
                        if (xVar == null) {
                            xVar = new x(this);
                            this.f12760b.set(xVar);
                        }
                        ArrayList arrayList = xVar.f12756a;
                        int size = arrayList.size();
                        int i7 = 0;
                        while (true) {
                            ArrayDeque arrayDeque = xVar.f12757b;
                            if (i7 < size) {
                                wVar = (w) arrayList.get(i7);
                                if (wVar.f12755c.equals(asList)) {
                                    arrayDeque.add(wVar);
                                    ?? r13 = wVar.d;
                                    if (r13 != 0) {
                                        wVar = r13;
                                    }
                                } else {
                                    i7++;
                                }
                            } else {
                                w wVar2 = new w(a7, str, asList);
                                arrayList.add(wVar2);
                                arrayDeque.add(wVar2);
                                wVar = null;
                                break;
                            }
                        }
                        try {
                            if (wVar != null) {
                                return wVar;
                            }
                            try {
                                int size2 = this.f12759a.size();
                                for (int i8 = 0; i8 < size2; i8++) {
                                    k a8 = ((C1044a) this.f12759a.get(i8)).a(a7, set, this);
                                    if (a8 != null) {
                                        ((w) xVar.f12757b.getLast()).d = a8;
                                        xVar.b(true);
                                        return a8;
                                    }
                                }
                                throw new IllegalArgumentException("No JsonAdapter for " + o5.e.h(a7, set));
                            } catch (IllegalArgumentException e3) {
                                throw xVar.a(e3);
                            }
                        } finally {
                            xVar.b(false);
                        }
                    } finally {
                    }
                }
            }
            throw new NullPointerException("annotations == null");
        }
        throw new NullPointerException("type == null");
    }
}
