package b0;

import android.system.Os;
import java.io.FileDescriptor;
/* loaded from: classes.dex */
public abstract class h {
    public static void a(FileDescriptor fileDescriptor) {
        Os.close(fileDescriptor);
    }

    public static FileDescriptor b(FileDescriptor fileDescriptor) {
        return Os.dup(fileDescriptor);
    }

    public static long c(FileDescriptor fileDescriptor, long j7, int i7) {
        return Os.lseek(fileDescriptor, j7, i7);
    }
}
