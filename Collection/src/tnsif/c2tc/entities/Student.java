package tnsif.c2tc.entities;

import java.util.Objects;

public class Student implements Comparable <Student> {
		private int uid;
		private String name;
		public int getUid() {
			return uid;
		}
		public void setUid(int uid) {
			this.uid = uid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public int hashCode() {
			return Objects.hash(name, uid);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Student other = (Student) obj;
			return Objects.equals(name, other.name) && uid == other.uid;
		
			}
		@Override
		public String toString() {
			return "Student [uid=" + uid + ", name=" + name + "]";
		}
		@Override
		public int compareTo(Student o) {
			if(this.getUid()>o.getUid())
				return 1;
			else
				return -1;
		}
		}

