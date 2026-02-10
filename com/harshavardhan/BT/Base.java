package com.harshavardhan.BT;
import java.util.*;
public class Base {

	static class Node{
		int val;
		Node left,right;
		Node(int val){
			this.val=val;
		}
	}
	static class Pair{
		Node node;
		int level;
		Pair(Node n, int l){
			this.node=n;
			this.level=l;
		}
	}
	static Node insert(String[] s){
        if(s.length==0 || s[0].equals("N")) return null;
        Node root = new Node(Integer.parseInt(s[0]));
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i=1;

        while(!q.isEmpty() && i<s.length){
            Node cur = q.poll();

            if(!s[i].equals("N")){
                cur.left = new Node(Integer.parseInt(s[i]));
                q.add(cur.left);
            }
            i++;
            if(i==s.length) break;

            if(!s[i].equals("N")){
                cur.right = new Node(Integer.parseInt(s[i]));
                q.add(cur.right);
            }
            i++;
        }
        return root;
    }
	static void display(Node root){
        if(root==null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            Node cur = q.poll();
            System.out.print(cur.val+"-> ");
            if(cur.left!=null){ System.out.print(cur.left.val+" "); q.add(cur.left); }
            if(cur.right!=null){ System.out.print(cur.right.val+" "); q.add(cur.right); }
            System.out.println();
        }
    }
	static int size(Node root){
        if(root==null) return 0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int c=0;
        while(!q.isEmpty()){
            Node cur=q.poll();
            c++;
            if(cur.left!=null) q.add(cur.left);
            if(cur.right!=null) q.add(cur.right);
        }
        return c;
    }
	
	//Counting
	static int countLeaf(Node root){
        int c=0;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node cur=q.poll();
            if(cur.left==null && cur.right==null) c++;
            if(cur.left!=null) q.add(cur.left);
            if(cur.right!=null) q.add(cur.right);
        }
        return c;
    }

    static int countNonLeaf(Node root){
        int c=0;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node cur=q.poll();
            if(cur.left!=null || cur.right!=null) c++;
            if(cur.left!=null) q.add(cur.left);
            if(cur.right!=null) q.add(cur.right);
        }
        return c;
    }

    static int countFull(Node root){
        int c=0;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node cur=q.poll();
            if(cur.left!=null && cur.right!=null) c++;
            if(cur.left!=null) q.add(cur.left);
            if(cur.right!=null) q.add(cur.right);
        }
        return c;
    }

    static int countOneChild(Node root){
        int c=0;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node cur=q.poll();
            if((cur.left!=null && cur.right==null) ||
               (cur.left==null && cur.right!=null)) c++;
            if(cur.left!=null) q.add(cur.left);
            if(cur.right!=null) q.add(cur.right);
        }
        return c;
    }
    
    //Sum
    static int sumAll(Node root){
        int sum=0;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node cur=q.poll();
            sum+=cur.val;
            if(cur.left!=null) q.add(cur.left);
            if(cur.right!=null) q.add(cur.right);
        }
        return sum;
    }

    static int sumLeaf(Node root){
        int sum=0;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node cur=q.poll();
            if(cur.left==null && cur.right==null) sum+=cur.val;
            if(cur.left!=null) q.add(cur.left);
            if(cur.right!=null) q.add(cur.right);
        }
        return sum;
    }

    static int sumNonLeaf(Node root){
        int sum=0;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node cur=q.poll();
            if(cur.left!=null || cur.right!=null) sum+=cur.val;
            if(cur.left!=null) q.add(cur.left);
            if(cur.right!=null) q.add(cur.right);
        }
        return sum;
    }

    static int sumEven(Node root){
        int sum=0;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node cur=q.poll();
            if(cur.val%2==0) sum+=cur.val;
            if(cur.left!=null) q.add(cur.left);
            if(cur.right!=null) q.add(cur.right);
        }
        return sum;
    }

    static int sumOdd(Node root){
        int sum=0;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node cur=q.poll();
            if(cur.val%2!=0) sum+=cur.val;
            if(cur.left!=null) q.add(cur.left);
            if(cur.right!=null) q.add(cur.right);
        }
        return sum;
    }

    static int sumOneChild(Node root){
        int sum=0;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node cur=q.poll();
            if((cur.left!=null && cur.right==null) ||
               (cur.left==null && cur.right!=null))
                sum+=cur.val;
            if(cur.left!=null) q.add(cur.left);
            if(cur.right!=null) q.add(cur.right);
        }
        return sum;
    }

    static int sumTwoChildren(Node root){
        int sum=0;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node cur=q.poll();
            if(cur.left!=null && cur.right!=null) sum+=cur.val;
            if(cur.left!=null) q.add(cur.left);
            if(cur.right!=null) q.add(cur.right);
        }
        return sum;
    }
    
    //Extremes
    static int max(Node root){
        int max=Integer.MIN_VALUE;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node cur=q.poll();
            max=Math.max(max,cur.val);
            if(cur.left!=null) q.add(cur.left);
            if(cur.right!=null) q.add(cur.right);
        }
        return max;
    }

    static int min(Node root){
        int min=Integer.MAX_VALUE;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node cur=q.poll();
            min=Math.min(min,cur.val);
            if(cur.left!=null) q.add(cur.left);
            if(cur.right!=null) q.add(cur.right);
        }
        return min;
    }

    static int secondMax(Node root){
        int max=Integer.MIN_VALUE, second=Integer.MIN_VALUE;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node cur=q.poll();
            if(cur.val>max){
                second=max; max=cur.val;
            }else if(cur.val<max && cur.val>second){
                second=cur.val;
            }
            if(cur.left!=null) q.add(cur.left);
            if(cur.right!=null) q.add(cur.right);
        }
        return second;
    }

    static int secondMin(Node root){
        int min=Integer.MAX_VALUE, second=Integer.MAX_VALUE;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node cur=q.poll();
            if(cur.val<min){
                second=min; min=cur.val;
            }else if(cur.val>min && cur.val<second){
                second=cur.val;
            }
            if(cur.left!=null) q.add(cur.left);
            if(cur.right!=null) q.add(cur.right);
        }
        return second;
    }

    static int maxLeaf(Node root){
        int max=Integer.MIN_VALUE;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node cur=q.poll();
            if(cur.left==null && cur.right==null)
                max=Math.max(max,cur.val);
            if(cur.left!=null) q.add(cur.left);
            if(cur.right!=null) q.add(cur.right);
        }
        return max;
    }

    static int minLeaf(Node root){
        int min=Integer.MAX_VALUE;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node cur=q.poll();
            if(cur.left==null && cur.right==null)
                min=Math.min(min,cur.val);
            if(cur.left!=null) q.add(cur.left);
            if(cur.right!=null) q.add(cur.right);
        }
        return min;
    }
    //Level Based
    static int sumEvenLevel(Node root){
        int sum=0;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair p=q.poll();
            if(p.level%2==0) sum+=p.node.val;
            if(p.node.left!=null) q.add(new Pair(p.node.left,p.level+1));
            if(p.node.right!=null) q.add(new Pair(p.node.right,p.level+1));
        }
        return sum;
    }

    static int sumOddLevel(Node root){
        int sum=0;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair p=q.poll();
            if(p.level%2!=0) sum+=p.node.val;
            if(p.node.left!=null) q.add(new Pair(p.node.left,p.level+1));
            if(p.node.right!=null) q.add(new Pair(p.node.right,p.level+1));
        }
        return sum;
    }

    static int countAtLevel(Node root,int k){
        int c=0;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair p=q.poll();
            if(p.level==k) c++;
            if(p.node.left!=null) q.add(new Pair(p.node.left,p.level+1));
            if(p.node.right!=null) q.add(new Pair(p.node.right,p.level+1));
        }
        return c;
    }

    static int sumAtLevel(Node root,int k){
        int sum=0;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair p=q.poll();
            if(p.level==k) sum+=p.node.val;
            if(p.node.left!=null) q.add(new Pair(p.node.left,p.level+1));
            if(p.node.right!=null) q.add(new Pair(p.node.right,p.level+1));
        }
        return sum;
    }

    static int maxAtLevel(Node root,int k){
        int max=Integer.MIN_VALUE;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair p=q.poll();
            if(p.level==k) max=Math.max(max,p.node.val);
            if(p.node.left!=null) q.add(new Pair(p.node.left,p.level+1));
            if(p.node.right!=null) q.add(new Pair(p.node.right,p.level+1));
        }
        return max;
    }
    //Structure
    static boolean isFull(Node root){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node cur=q.poll();
            if((cur.left==null && cur.right!=null) ||
               (cur.left!=null && cur.right==null))
                return false;
            if(cur.left!=null) q.add(cur.left);
            if(cur.right!=null) q.add(cur.right);
        }
        return true;
    }

    static boolean isPerfect(Node root){
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0));
        int leafLevel=-1;
        while(!q.isEmpty()){
            Pair p=q.poll();
            Node cur=p.node;
            if(cur.left==null && cur.right==null){
                if(leafLevel==-1) leafLevel=p.level;
                else if(p.level!=leafLevel) return false;
            }else{
                if(cur.left==null || cur.right==null) return false;
            }
            if(cur.left!=null) q.add(new Pair(cur.left,p.level+1));
            if(cur.right!=null) q.add(new Pair(cur.right,p.level+1));
        }
        return true;
    }

    static boolean isComplete(Node root){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        boolean seenNull=false;
        while(!q.isEmpty()){
            Node cur=q.poll();
            if(cur.left!=null){
                if(seenNull) return false;
                q.add(cur.left);
            }else seenNull=true;

            if(cur.right!=null){
                if(seenNull) return false;
                q.add(cur.right);
            }else seenNull=true;
        }
        return true;
    }
    static boolean areIdentical(Node r1, Node r2) {
    	Queue<Node> q1 = new LinkedList<>();
        Queue<Node> q2 = new LinkedList<>();
        q1.add(r1);
        q2.add(r2);
        while(!q1.isEmpty() && !q2.isEmpty()){
            Node n1 = q1.poll();
            Node n2 = q2.poll();
            if(n1==null && n2==null) continue;
            if(n1==null || n2== null) return false;
            if(n1.val!=n2.val) return false;
            q1.add(n1.left);
            q2.add(n2.left);
            q1.add(n1.right);
            q2.add(n2.right);
        }
    	return q1.isEmpty() && q2.isEmpty();
    }
    static boolean areMirror(Node r1, Node r2) {
    	Queue<Node> q1 = new LinkedList<>();
        Queue<Node> q2 = new LinkedList<>();
        q1.add(r1);
        q2.add(r2);
        while(!q1.isEmpty() && !q2.isEmpty()){
            Node n1 = q1.poll();
            Node n2 = q2.poll();
            if(n1==null && n2==null) continue;
            if(n1==null || n2== null) return false;
            if(n1.val!=n2.val) return false;
            q1.add(n1.left);
            q2.add(n2.right);
            q1.add(n1.right);
            q2.add(n2.left);
        }
        return q1.isEmpty() && q2.isEmpty();
    }
    static boolean isSymmetric(Node root) {
    	if(root==null) return true;
        Queue<Node> q1 = new LinkedList<>();
        Queue<Node> q2 = new LinkedList<>();
        q1.add(root.left);
        q2.add(root.right);
        while(!q1.isEmpty() && !q2.isEmpty()){
            Node n1 = q1.poll();
            Node n2 = q2.poll();
            if(n1==null && n2==null) continue;
            if(n1==null || n2==null) return false;
            if(n1.val!=n2.val) return false;
            q1.add(n1.left);
            q2.add(n2.right);
            q1.add(n1.right);
            q2.add(n2.left);
        }
    	return true;
    }
    //Relational
    static int countLeftChildren(Node root){
        int c=0;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node cur=q.poll();
            if(cur.left!=null){ c++; q.add(cur.left); }
            if(cur.right!=null) q.add(cur.right);
        }
        return c;
    }

    static int countRightChildren(Node root){
        int c=0;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node cur=q.poll();
            if(cur.right!=null){ c++; q.add(cur.right); }
            if(cur.left!=null) q.add(cur.left);
        }
        return c;
    }

    static int sumParentOfLeaf(Node root){
        int sum=0;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node cur=q.poll();
            if(cur.left!=null && cur.left.left==null && cur.left.right==null)
                sum+=cur.val;
            if(cur.right!=null && cur.right.left==null && cur.right.right==null)
                sum+=cur.val;
            if(cur.left!=null) q.add(cur.left);
            if(cur.right!=null) q.add(cur.right);
        }
        return sum;
    }

    static int countParentOfLeaf(Node root){
        int c=0;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node cur=q.poll();
            if(cur.left!=null && cur.left.left==null && cur.left.right==null) c++;
            if(cur.right!=null && cur.right.left==null && cur.right.right==null) c++;
            if(cur.left!=null) q.add(cur.left);
            if(cur.right!=null) q.add(cur.right);
        }
        return c;
    }
    //Search
    static boolean exists(Node root,int key){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node cur=q.poll();
            if(cur.val==key) return true;
            if(cur.left!=null) q.add(cur.left);
            if(cur.right!=null) q.add(cur.right);
        }
        return false;
    }

    static int countOccurrences(Node root,int key){
        int c=0;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node cur=q.poll();
            if(cur.val==key) c++;
            if(cur.left!=null) q.add(cur.left);
            if(cur.right!=null) q.add(cur.right);
        }
        return c;
    }

    static int findLevel(Node root,int key){
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair p=q.poll();
            if(p.node.val==key) return p.level;
            if(p.node.left!=null) q.add(new Pair(p.node.left,p.level+1));
            if(p.node.right!=null) q.add(new Pair(p.node.right,p.level+1));
        }
        return -1;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.nextLine().split(" ");
		sc.close();
		Node a = insert(s);
		display(a);
		System.out.println(size(a));
	}
}
