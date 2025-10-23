package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o.C1053f;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: i  reason: collision with root package name */
    public static final Object f5840i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public static volatile j f5841j;

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantReadWriteLock f5842a;

    /* renamed from: b  reason: collision with root package name */
    public final C1053f f5843b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f5844c;
    public final Handler d;

    /* renamed from: e  reason: collision with root package name */
    public final e f5845e;
    public final i f;

    /* renamed from: g  reason: collision with root package name */
    public final int f5846g;

    /* renamed from: h  reason: collision with root package name */
    public final c f5847h;

    public j(p pVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f5842a = reentrantReadWriteLock;
        this.f5844c = 3;
        i iVar = (i) pVar.f5838b;
        this.f = iVar;
        int i7 = pVar.f5837a;
        this.f5846g = i7;
        this.f5847h = (c) pVar.f5839c;
        this.d = new Handler(Looper.getMainLooper());
        this.f5843b = new C1053f();
        e eVar = new e(this);
        this.f5845e = eVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i7 == 0) {
            try {
                this.f5844c = 0;
            } catch (Throwable th) {
                this.f5842a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                iVar.a(new d(eVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static j a() {
        j jVar;
        boolean z7;
        synchronized (f5840i) {
            try {
                jVar = f5841j;
                if (jVar != null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (!z7) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return jVar;
    }

    public final int b() {
        this.f5842a.readLock().lock();
        try {
            return this.f5844c;
        } finally {
            this.f5842a.readLock().unlock();
        }
    }

    public final void c() {
        boolean z7;
        if (this.f5846g == 1) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            if (b() == 1) {
                return;
            }
            this.f5842a.writeLock().lock();
            try {
                if (this.f5844c == 0) {
                    return;
                }
                this.f5844c = 0;
                this.f5842a.writeLock().unlock();
                e eVar = this.f5845e;
                j jVar = (j) eVar.f5836c;
                try {
                    jVar.f.a(new d(eVar));
                    return;
                } catch (Throwable th) {
                    jVar.d(th);
                    return;
                }
            } finally {
                this.f5842a.writeLock().unlock();
            }
        }
        throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f5842a.writeLock().lock();
        try {
            this.f5844c = 2;
            arrayList.addAll(this.f5843b);
            this.f5843b.clear();
            this.f5842a.writeLock().unlock();
            this.d.post(new H.a(arrayList, this.f5844c, th));
        } catch (Throwable th2) {
            this.f5842a.writeLock().unlock();
            throw th2;
        }
    }

    public final void e() {
        ArrayList arrayList = new ArrayList();
        this.f5842a.writeLock().lock();
        try {
            this.f5844c = 1;
            arrayList.addAll(this.f5843b);
            this.f5843b.clear();
            this.f5842a.writeLock().unlock();
            this.d.post(new H.a(arrayList, this.f5844c, (Throwable) null));
        } catch (Throwable th) {
            this.f5842a.writeLock().unlock();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0096 A[Catch: all -> 0x0078, TryCatch #0 {all -> 0x0078, blocks: (B:32:0x005c, B:35:0x0061, B:37:0x0065, B:39:0x0072, B:44:0x0085, B:46:0x008f, B:48:0x0092, B:50:0x0096, B:52:0x00a6, B:53:0x00a9, B:55:0x00b6, B:58:0x00be, B:63:0x00dd, B:69:0x00e9, B:72:0x00f7, B:73:0x0101, B:74:0x0119, B:76:0x0120, B:77:0x0125, B:79:0x0130, B:81:0x0137, B:83:0x013b, B:85:0x0143, B:87:0x0147, B:90:0x014f, B:93:0x015d, B:94:0x0162, B:96:0x0179, B:42:0x007b), top: B:115:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x015d A[Catch: all -> 0x0078, TryCatch #0 {all -> 0x0078, blocks: (B:32:0x005c, B:35:0x0061, B:37:0x0065, B:39:0x0072, B:44:0x0085, B:46:0x008f, B:48:0x0092, B:50:0x0096, B:52:0x00a6, B:53:0x00a9, B:55:0x00b6, B:58:0x00be, B:63:0x00dd, B:69:0x00e9, B:72:0x00f7, B:73:0x0101, B:74:0x0119, B:76:0x0120, B:77:0x0125, B:79:0x0130, B:81:0x0137, B:83:0x013b, B:85:0x0143, B:87:0x0147, B:90:0x014f, B:93:0x015d, B:94:0x0162, B:96:0x0179, B:42:0x007b), top: B:115:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0179 A[Catch: all -> 0x0078, TRY_LEAVE, TryCatch #0 {all -> 0x0078, blocks: (B:32:0x005c, B:35:0x0061, B:37:0x0065, B:39:0x0072, B:44:0x0085, B:46:0x008f, B:48:0x0092, B:50:0x0096, B:52:0x00a6, B:53:0x00a9, B:55:0x00b6, B:58:0x00be, B:63:0x00dd, B:69:0x00e9, B:72:0x00f7, B:73:0x0101, B:74:0x0119, B:76:0x0120, B:77:0x0125, B:79:0x0130, B:81:0x0137, B:83:0x013b, B:85:0x0143, B:87:0x0147, B:90:0x014f, B:93:0x015d, B:94:0x0162, B:96:0x0179, B:42:0x007b), top: B:115:0x005c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence f(java.lang.CharSequence r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.j.f(java.lang.CharSequence, int, int):java.lang.CharSequence");
    }

    public final void g(h hVar) {
        android.support.v4.media.session.b.j(hVar, "initCallback cannot be null");
        this.f5842a.writeLock().lock();
        try {
            if (this.f5844c != 1 && this.f5844c != 2) {
                this.f5843b.add(hVar);
                this.f5842a.writeLock().unlock();
            }
            this.d.post(new H.a(Arrays.asList(hVar), this.f5844c, (Throwable) null));
            this.f5842a.writeLock().unlock();
        } catch (Throwable th) {
            this.f5842a.writeLock().unlock();
            throw th;
        }
    }
}
