package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.InterfaceC0328f;
import androidx.lifecycle.InterfaceC0342u;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements F0.b {
    @Override // F0.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // F0.b
    public final /* bridge */ /* synthetic */ Object b(Context context) {
        c(context);
        return Boolean.TRUE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.emoji2.text.f, androidx.emoji2.text.p] */
    public final void c(Context context) {
        ?? fVar = new f(new T1.j(context, 1));
        fVar.f5837a = 1;
        if (j.f5841j == null) {
            synchronized (j.f5840i) {
                try {
                    if (j.f5841j == null) {
                        j.f5841j = new j(fVar);
                    }
                } finally {
                }
            }
        }
        d(context);
    }

    public final void d(Context context) {
        Object obj;
        F0.a c5 = F0.a.c(context);
        c5.getClass();
        synchronized (F0.a.f620e) {
            try {
                obj = c5.f621a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c5.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        final P1.c q5 = ((InterfaceC0342u) obj).q();
        q5.g(new InterfaceC0328f() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.InterfaceC0328f
            public final void a(InterfaceC0342u interfaceC0342u) {
                Handler handler;
                EmojiCompatInitializer.this.getClass();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = a.a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new l(0), 500L);
                q5.v(this);
            }

            @Override // androidx.lifecycle.InterfaceC0328f
            public final /* synthetic */ void b(InterfaceC0342u interfaceC0342u) {
            }

            @Override // androidx.lifecycle.InterfaceC0328f
            public final void c(InterfaceC0342u interfaceC0342u) {
                M5.g.f(interfaceC0342u, "owner");
            }

            @Override // androidx.lifecycle.InterfaceC0328f
            public final /* synthetic */ void f(InterfaceC0342u interfaceC0342u) {
            }

            @Override // androidx.lifecycle.InterfaceC0328f
            public final /* synthetic */ void h(InterfaceC0342u interfaceC0342u) {
            }

            @Override // androidx.lifecycle.InterfaceC0328f
            public final void i(InterfaceC0342u interfaceC0342u) {
                M5.g.f(interfaceC0342u, "owner");
            }
        });
    }
}
