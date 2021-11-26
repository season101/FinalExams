## CSCI 4055 : Database Management Systems

### Final Exam Contents

##### 1. Part 6 : Database Design Theory and Normalization

  - [ ] Chapter 14 Basics of Functional Dependencies and Normalization for Relational Databases

  - [ ] Chapter Relational Database Design Algorithms and Further Dependencies


##### 2. Part 7: File Structures, Hashing, Indexing, and Physical Database Design

  - [ ] Chapter 16 Disk Storage, Basic File Structures, Hashing, and Modern Storage Architectures

  - [ ] Chapter 17 Indexing Structures for Files and Physical Database Design

---

### Chapter 14 Basics of Functional Dependencies and Normalization for Relational Databases


> To measure formally why one set of groupings of attributes into relation schemas is better than another.


There are two levels at which we can discuss the goodness of relation schemas. The
first is the logical (or conceptual) level—how users interpret the relation schemas
and the meaning of their attributes. The second is the implementation (or
physical storage) level—how the tuples in a base relation are stored and updated.

Database design may be performed using two
approaches: **bottom-up** or **top-down**.

**A bottom-up design methodology** (also called
*design by synthesis*) considers the basic relationships among individual attributes as the starting point and uses those to construct relation schemas. This approach is not very popular in practice because it suffers from the problem of having to collect a
large number of binary relationships among attributes as the starting point. For practical situations, it is next to impossible to capture binary relationships among all such pairs of attributes.

**A top-down design methodology** (also called *design by analysis*) starts with a number of groupings of attributes into relations that exist together naturally, for example, on an invoice, a form, or a report. The relations are then analyzed individually and collectively, leading to further decomposition until all desirable properties are met.

The theory described in this chapter is applicable primarily to the top-down design approach, and as such is more appropriate when performing design of databases by analysis and decomposition of sets of attributes that appear together in files, in reports, and on forms in real-life situations.

> The implicit goals of the design activity are **information preservation** and **minimum redundancy**.

#### 14.1 Informal Design Guidelines for Relation Schemes

Four Informal guidelines that may be used as measures to determine the quality of relation schema design:

 - Making sure that the semantics of the attributes is clear in the schema

 - Reducing the redundant information in tuples

 - Reducing the Null values in tuples

- Disallowing the possibility of generating spurious tuples

Note: Storing Natural Joins of base relations leads to an additional problem referred to as update anomalies.
These can be classified as :

1. Insertion Anomalies
2. Deletion Anomalies
3. Modification Anomalies

